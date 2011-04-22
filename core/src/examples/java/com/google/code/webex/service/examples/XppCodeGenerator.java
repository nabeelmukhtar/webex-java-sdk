/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.google.code.webex.service.examples;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement.DEFAULT;

/**
 * The Class XppCodeGenerator.
 */
public class XppCodeGenerator {
	
	/** The Constant SOURCE_DIR. */
	private static final String SOURCE_DIR = "E:\\workspace\\opensource\\webex-java-sdk\\schema\\src\\main\\java";
	
	/** The Constant DESTINATION_DIR. */
	private static final String DESTINATION_DIR = "E:\\workspace\\opensource\\webex-java-sdk\\schema\\src\\main\\andoid";
	
	/** The Constant PACKAGE_NAME. */
	private static final String PACKAGE_NAME = "com.webex.schemas._2002._06.service.common";
	
	/** The Constant EXCLUDED_FILES. */
	private static final List<String> EXCLUDED_FILES = Arrays.asList("XppUtils.java", "ObjectFactory.java", "BaseSchemaEntity.java", "package-info.java");
	
	/** The Constant INCLUDED_FILES. */
	private static final List<String> INCLUDED_FILES = new ArrayList<String>();

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 * 
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		File[] sourceFiles = new File(SOURCE_DIR + File.separatorChar + PACKAGE_NAME.replace('.', File.separatorChar)).listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java") && !EXCLUDED_FILES.contains(pathname.getName()) && (INCLUDED_FILES.isEmpty() || INCLUDED_FILES.contains(pathname.getName()));
			}
		});
		
		if (sourceFiles != null) {
			String destinationFolder = DESTINATION_DIR + File.separatorChar + PACKAGE_NAME.replace('.', File.separatorChar);
			new File(destinationFolder).mkdirs();
			for (File file : sourceFiles) {
				File destinationFile = new File(destinationFolder, file.getName());
				FileWriter writer = new FileWriter(destinationFile);
				Class<?> clazz = Class.forName(PACKAGE_NAME + "." + file.getName().replace(".java", ""));
				if (clazz.isEnum()) {
					generateEnumCode(clazz, writer);
				} else {
					generateClassCode(clazz, writer);
				}
				writer.close();
				System.out.println("Updated file: " + destinationFile.getAbsolutePath());
			}
		}
	}

	/**
	 * Generate enum code.
	 * 
	 * @param clazz the clazz
	 * @param out the out
	 * 
	 * @throws Exception the exception
	 */
	private static void generateEnumCode(Class<?> clazz, Writer out) throws Exception {
		out.write("package " + PACKAGE_NAME + ";\r\n");
		out.write("public enum " + clazz.getSimpleName() + " {\r\n");
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			if (field.getType().equals(clazz)) {
				String value = field.getName();
				XmlEnumValue annotation = field.getAnnotation(XmlEnumValue.class);
				if (annotation != null) {
					value = annotation.value();
				}
				out.write("    " + field.getName() + "(\"" + value + "\"),\r\n");
			}
		}
		out.write("    ;\r\n");
		out.write("    private final String value;\r\n");
		out.write("    " + clazz.getSimpleName() + "(String v) {\r\n");
		out.write("        value = v;\r\n");
		out.write("    }\r\n");
		out.write("    public String value() {\r\n");
		out.write("        return value;\r\n");
		out.write("    }\r\n");
		out.write("    public static " + clazz.getSimpleName() + " fromValue(String v) {\r\n");
		out.write("        for (" + clazz.getSimpleName() + " c: " + clazz.getSimpleName() + ".values()) {\r\n");
		out.write("            if (c.value.equals(v)) {\r\n");
		out.write("                return c;\r\n");
		out.write("            }\r\n");
		out.write("        }\r\n");
		out.write("        return null;\r\n");
		out.write("    }\r\n");
		out.write("}\r\n");
	}
	
	/**
	 * Generate class code.
	 * 
	 * @param clazz the clazz
	 * @param out the out
	 * 
	 * @throws Exception the exception
	 */
	private static void generateClassCode(Class<?> clazz, Writer out) throws Exception {
		out.write("package " + PACKAGE_NAME + ";\r\n");
		out.write("import java.io.IOException;\r\n");
		out.write("import java.util.ArrayList;\r\n");
		out.write("import java.util.List;\r\n");
		out.write("import org.xmlpull.v1.XmlPullParser;\r\n");
		out.write("import org.xmlpull.v1.XmlPullParserException;\r\n");
		out.write("import org.xmlpull.v1.XmlSerializer;\r\n");
		out.write("import com.webex.schemas._2002._06.common.BaseSchemaEntity;\r\n");
		out.write("import com.webex.schemas._2002._06.common.XppUtils;\r\n");
		out.write("public class " + clazz.getSimpleName() + " extends BaseSchemaEntity {\r\n");
		out.write("    private final static long serialVersionUID = 2461660169443089969L;\r\n");
		
		generateFieldDecrataions(clazz, out);
		generateGetterSetters(clazz, out);
		generateInitMethod(clazz, out);
		generateToXmlMethod(clazz, out);
		
		out.write("}\r\n");
	}

	/**
	 * Generate getter setters.
	 * 
	 * @param clazz the clazz
	 * @param out the out
	 * 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static void generateGetterSetters(Class<?> clazz, Writer out) throws IOException {
		Field[] fields = clazz.getDeclaredFields();		
		for (Field field : fields) {
			if (!Modifier.isStatic(field.getModifiers())) {
				if (List.class.isAssignableFrom(field.getType())) {
					Class<?> type = Object.class;
					XmlElement element = field.getAnnotation(XmlElement.class);
					if (element != null) {
						if (element.type() == DEFAULT.class) {
							type = String.class;
						} else {
							type = element.type();
						}
					} else {
						System.out.println("Could not find generic type:" + field.getName());
					}
					// getter
					out.write("    public " + inter(field.getType().getSimpleName()) + "<" + inter(type.getSimpleName()) + "> get" + camel(field.getName()) + "() {\r\n");
					out.write("        if (" + field.getName() + " == null) {\r\n");
					out.write("            " + field.getName() + " = new ArrayList<" + inter(type.getSimpleName()) + ">();\r\n");
					out.write("        }\r\n");
					out.write("        return this." + field.getName() + ";\r\n");
					out.write("    }\r\n");
					
					// setter
					out.write("    public void set" + camel(field.getName()) + "(" + inter(field.getType().getSimpleName()) + "<" + inter(type.getSimpleName()) + "> value) {\r\n");
					out.write("        this." + field.getName() + " = value;\r\n");
					out.write("    }\r\n");
				} else {
					// getter
					out.write("    public " + inter(field.getType().getSimpleName()) + " get" + camel(field.getName()) + "() {\r\n");
					out.write("        return " + field.getName() + ";\r\n");
					out.write("    }\r\n");
					
					// setter
					out.write("    public void set" + camel(field.getName()) + "(" + inter(field.getType().getSimpleName()) + " value) {\r\n");
					out.write("        " + field.getName() + " = (("  + field.getType().getSimpleName() + ") value);\r\n");
					out.write("    }\r\n");
				}
			}
		}
	}

	/**
	 * Generate field decrataions.
	 * 
	 * @param clazz the clazz
	 * @param out the out
	 * 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static void generateFieldDecrataions(Class<?> clazz, Writer out)
			throws IOException {
		Field[] fields = clazz.getDeclaredFields();		
		for (Field field : fields) {
			if (!Modifier.isStatic(field.getModifiers())) {
				if (List.class.isAssignableFrom(field.getType())) {
					Class<?> type = Object.class;
					XmlElement element = field.getAnnotation(XmlElement.class);
					if (element != null) {
						if (element.type() == DEFAULT.class) {
							type = String.class;
						} else {
							type = element.type();
						}
					} else {
						System.out.println("Could not find generic type:" + field.getName());
					}
					out.write("    protected " + field.getType().getSimpleName() + "<" + inter(type.getSimpleName()) + "> " + field.getName() + ";\r\n");
				} else {
					out.write("    protected " + field.getType().getSimpleName() + " " + field.getName() + ";\r\n");
				}
			}
		}
	}

	/**
	 * Generate init method.
	 * 
	 * @param clazz the clazz
	 * @param out the out
	 * 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static void generateInitMethod(Class<?> clazz, Writer out)
			throws IOException {
		Field[] fields = clazz.getDeclaredFields();
		out.write("    @Override\r\n");
		out.write("    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {\r\n");
		out.write("        parser.require(XmlPullParser.START_TAG, null, null);\r\n");
		List<Field> elementFields = new ArrayList<Field>();
		for (Field field : fields) {
			if (!Modifier.isStatic(field.getModifiers())) {
				XmlAttribute attribute =  field.getAnnotation(XmlAttribute.class);
				String name = field.getName();
				if (attribute != null) {
					name = attribute.name().equals("##default")? field.getName() : attribute.name();
					if (field.getType().isEnum()) {
						out.write("        set" + camel(field.getName()) + "(" + field.getType().getSimpleName() + ".fromValue(XppUtils.getAttributeValueFromNode(parser)));\r\n");
					} else if (Long.class.isAssignableFrom(field.getType())) {
						out.write("        set" + camel(field.getName()) + "(XppUtils.getAttributeValueAsLongFromNode(parser, \"" + name + "\"));\r\n");
					} else {
						out.write("        set" + camel(field.getName()) + "(XppUtils.getAttributeValueFromNode(parser, \"" + name + "\"));\r\n");
					}
				} else {
					XmlElement element = field.getAnnotation(XmlElement.class);
					if (element != null) {
						elementFields.add(field);
					} else {
						elementFields.add(field);
						System.out.println("Could not find desired annotation:" + field.getName());
					}
				}
			}
		}
		out.write("        while (parser.nextTag() == XmlPullParser.START_TAG) {\r\n");
		out.write("            String name = parser.getName();\r\n");
		boolean firstField = true;
		for (Field field : elementFields) {
			XmlElement element = field.getAnnotation(XmlElement.class);
			String name = field.getName();
			if (element != null && !element.name().equals("##default")) {
				name = element.name();
			}
			if (firstField) {
				out.write("            if (name.equals(\"" + name + "\")) {\r\n");
				firstField = false;
			} else {
				out.write("            } else if (name.equals(\"" + name + "\")) {\r\n");
			}
			if (field.getType().isEnum()) {
				out.write("                set" + camel(field.getName()) + "(" + field.getType().getSimpleName() + ".fromValue(XppUtils.getElementValueFromNode(parser)));\r\n");
			} else if (field.getType().isPrimitive()) {
				out.write("                set" + camel(field.getName()) + "(XppUtils.getElementValueFromNode(parser));\r\n");
			} else if (field.getType().getPackage() == null) {
				out.write("                //TODO-NM: Populate this field.\r\n");
			} else if (field.getType().getPackage().equals(Package.getPackage(PACKAGE_NAME))) {
				out.write("                " + field.getType().getSimpleName() + " node = new " + field.getType().getSimpleName() + "();\r\n");
				out.write("                node.init(parser);\r\n");
				out.write("                set" + camel(field.getName()) + "(node);\r\n");
			} else if (List.class.isAssignableFrom(field.getType())) {
				Class<?> type = Object.class;
				if (element != null) {
					if (element.type() == DEFAULT.class) {
						type = String.class;
					} else {
						type = element.type();
					}
				} else {
					System.out.println("Could not find generic type:" + field.getName());
				}
				if (type.equals(String.class)) {
					out.write("                get" + camel(field.getName()) + "().add(XppUtils.getElementValueFromNode(parser));\r\n");
				} else {
					out.write("                " + type.getSimpleName() + " node = new " + type.getSimpleName() + "();\r\n");
					out.write("                node.init(parser);\r\n");
					out.write("                get" + camel(field.getName()) + "().add(node);\r\n");
				}
			} else if (Long.class.isAssignableFrom(field.getType())) {
				out.write("                set" + camel(field.getName()) + "(XppUtils.getElementValueAsLongFromNode(parser));\r\n");
			} else {
				out.write("                set" + camel(field.getName()) + "(XppUtils.getElementValueFromNode(parser));\r\n");
			}
		}
		if (!firstField) {
			out.write("            } else {");
			out.write("                // Consume something we don't understand.\r\n");
			out.write("                LOG.warning(\"Found tag that we don't recognize: \" + name);\r\n");
			out.write("                XppUtils.skipSubTree(parser);\r\n");
			out.write("            }\r\n");
		} else {
			out.write("            // Consume something we don't understand.\r\n");
			out.write("            LOG.warning(\"Found tag that we don't recognize: \" + name);\r\n");
			out.write("            XppUtils.skipSubTree(parser);\r\n");
		}
		out.write("        }\r\n");
		out.write("    }\r\n");
	}

	/**
	 * Generate to xml method.
	 * 
	 * @param clazz the clazz
	 * @param out the out
	 * 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static void generateToXmlMethod(Class<?> clazz, Writer out) throws IOException {
		String tagName = clazz.getSimpleName();
		XmlRootElement rootElement = clazz.getAnnotation(XmlRootElement.class);
		if (rootElement != null && !rootElement.name().equals("##default")) {
			tagName = rootElement.name();
		}
		out.write("    @Override\r\n");
		out.write("    public void toXml(XmlSerializer serializer) throws IOException {\r\n");
		out.write("        XmlSerializer element = serializer.startTag(null, \"" + tagName + "\");\r\n");
		// TODO-NM: Implement this method.
		out.write("        \r\n");
		out.write("        \r\n");
		out.write("        serializer.endTag(null, \"" + tagName + "\");\r\n");
		out.write("    }\r\n");
	}

	/**
	 * Camel.
	 * 
	 * @param name the name
	 * 
	 * @return the string
	 */
	private static String camel(String name) {
		if (name.charAt(0) == '_') {
			return Character.toUpperCase(name.charAt(1)) + name.substring(2);
		} else {
			return Character.toUpperCase(name.charAt(0)) + name.substring(1);
		}
	}
	
	/**
	 * Inter.
	 * 
	 * @param name the name
	 * 
	 * @return the string
	 */
	private static String inter(String name) {
		return name.replace("Impl", "");
	}
}
