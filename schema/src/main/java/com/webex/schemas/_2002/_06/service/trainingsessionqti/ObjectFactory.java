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

package com.webex.schemas._2002._06.service.trainingsessionqti;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _ExtensionResponse_QNAME. */
    private final static QName _ExtensionResponse_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_response");
    
    /** The Constant _Control_QNAME. */
    private final static QName _Control_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "control");
    
    /** The Constant _ExtensionSectionResult_QNAME. */
    private final static QName _ExtensionSectionResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_section_result");
    
    /** The Constant _SectionResult_QNAME. */
    private final static QName _SectionResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "section_result");
    
    /** The Constant _ItemResult_QNAME. */
    private final static QName _ItemResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "item_result");
    
    /** The Constant _FieldName_QNAME. */
    private final static QName _FieldName_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "field_name");
    
    /** The Constant _ScoreStdError_QNAME. */
    private final static QName _ScoreStdError_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_std_error");
    
    /** The Constant _ExtensionGrade_QNAME. */
    private final static QName _ExtensionGrade_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_grade");
    
    /** The Constant _NumSectionsPresented_QNAME. */
    private final static QName _NumSectionsPresented_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_sections_presented");
    
    /** The Constant _Response_QNAME. */
    private final static QName _Response_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "response");
    
    /** The Constant _Name_QNAME. */
    private final static QName _Name_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "name");
    
    /** The Constant _Result_QNAME. */
    private final static QName _Result_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "result");
    
    /** The Constant _ScoreCut_QNAME. */
    private final static QName _ScoreCut_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_cut");
    
    /** The Constant _ResponseForm_QNAME. */
    private final static QName _ResponseForm_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "response_form");
    
    /** The Constant _ScoreInterpretation_QNAME. */
    private final static QName _ScoreInterpretation_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_interpretation");
    
    /** The Constant _ExtensionScore_QNAME. */
    private final static QName _ExtensionScore_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_score");
    
    /** The Constant _CorrectResponse_QNAME. */
    private final static QName _CorrectResponse_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "correct_response");
    
    /** The Constant _ScoreReliability_QNAME. */
    private final static QName _ScoreReliability_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_reliability");
    
    /** The Constant _ScoreValue_QNAME. */
    private final static QName _ScoreValue_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_value");
    
    /** The Constant _ScoreMin_QNAME. */
    private final static QName _ScoreMin_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_min");
    
    /** The Constant _QtiComment_QNAME. */
    private final static QName _QtiComment_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "qti_comment");
    
    /** The Constant _Datetime_QNAME. */
    private final static QName _Datetime_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "datetime");
    
    /** The Constant _Date_QNAME. */
    private final static QName _Date_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "date");
    
    /** The Constant _NumAttempts_QNAME. */
    private final static QName _NumAttempts_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_attempts");
    
    /** The Constant _ExtensionAssessmentResult_QNAME. */
    private final static QName _ExtensionAssessmentResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_assessment_result");
    
    /** The Constant _Objective_QNAME. */
    private final static QName _Objective_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "objective");
    
    /** The Constant _Status_QNAME. */
    private final static QName _Status_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "status");
    
    /** The Constant _ExtensionItemResult_QNAME. */
    private final static QName _ExtensionItemResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_item_result");
    
    /** The Constant _ScoreAverage_QNAME. */
    private final static QName _ScoreAverage_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_average");
    
    /** The Constant _TypeLabel_QNAME. */
    private final static QName _TypeLabel_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "type_label");
    
    /** The Constant _ExtensionResponseform_QNAME. */
    private final static QName _ExtensionResponseform_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_responseform");
    
    /** The Constant _Context_QNAME. */
    private final static QName _Context_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "context");
    
    /** The Constant _GenericIdentifier_QNAME. */
    private final static QName _GenericIdentifier_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "generic_identifier");
    
    /** The Constant _Vocabulary_QNAME. */
    private final static QName _Vocabulary_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "vocabulary");
    
    /** The Constant _NumItemsAttempted_QNAME. */
    private final static QName _NumItemsAttempted_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_items_attempted");
    
    /** The Constant _FieldValue_QNAME. */
    private final static QName _FieldValue_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "field_value");
    
    /** The Constant _ExtensionSummaryResult_QNAME. */
    private final static QName _ExtensionSummaryResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_summary_result");
    
    /** The Constant _ResponseValue_QNAME. */
    private final static QName _ResponseValue_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "response_value");
    
    /** The Constant _ExtensionResult_QNAME. */
    private final static QName _ExtensionResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_result");
    
    /** The Constant _ScoreNormalized_QNAME. */
    private final static QName _ScoreNormalized_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_normalized");
    
    /** The Constant _DurationType_QNAME. */
    private final static QName _DurationType_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "durationType");
    
    /** The Constant _AsiDescription_QNAME. */
    private final static QName _AsiDescription_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "asi_description");
    
    /** The Constant _QtiResultReport_QNAME. */
    private final static QName _QtiResultReport_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "qti_result_report");
    
    /** The Constant _FeedbackDisplayed_QNAME. */
    private final static QName _FeedbackDisplayed_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "feedback_displayed");
    
    /** The Constant _NumItemsPresented_QNAME. */
    private final static QName _NumItemsPresented_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_items_presented");
    
    /** The Constant _AssessmentResult_QNAME. */
    private final static QName _AssessmentResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "assessment_result");
    
    /** The Constant _NumSections_QNAME. */
    private final static QName _NumSections_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_sections");
    
    /** The Constant _ScoreMax_QNAME. */
    private final static QName _ScoreMax_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_max");
    
    /** The Constant _ExtensionContext_QNAME. */
    private final static QName _ExtensionContext_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_context");
    
    /** The Constant _StatusValue_QNAME. */
    private final static QName _StatusValue_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "status_value");
    
    /** The Constant _NumItems_QNAME. */
    private final static QName _NumItems_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_items");
    
    /** The Constant _IdentifierString_QNAME. */
    private final static QName _IdentifierString_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "identifier_string");

    /**
     * Instantiates a new object factory.
     */
    public ObjectFactory() {
    }

    /**
     * Creates a new Object object.
     * 
     * @return the asi description type
     */
    public AsiDescriptionType createAsiDescriptionType() {
        return new AsiDescriptionType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the asi metadatafield item result type
     */
    public AsiMetadatafieldItemResultType createAsiMetadatafieldItemResultType() {
        return new AsiMetadatafieldItemResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the num sections type
     */
    public NumSectionsType createNumSectionsType() {
        return new NumSectionsType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the generic identifier type
     */
    public GenericIdentifierType createGenericIdentifierType() {
        return new GenericIdentifierType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension assessment result type
     */
    public ExtensionAssessmentResultType createExtensionAssessmentResultType() {
        return new ExtensionAssessmentResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension response type
     */
    public ExtensionResponseType createExtensionResponseType() {
        return new ExtensionResponseType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the context type
     */
    public ContextType createContextType() {
        return new ContextType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension item result type
     */
    public ExtensionItemResultType createExtensionItemResultType() {
        return new ExtensionItemResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the response form type
     */
    public ResponseFormType createResponseFormType() {
        return new ResponseFormType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the assessment result type
     */
    public AssessmentResultType createAssessmentResultType() {
        return new AssessmentResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the item result type
     */
    public ItemResultType createItemResultType() {
        return new ItemResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the outcomes item result type
     */
    public OutcomesItemResultType createOutcomesItemResultType() {
        return new OutcomesItemResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the objective type
     */
    public ObjectiveType createObjectiveType() {
        return new ObjectiveType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the asi metadatafield assessment result type
     */
    public AsiMetadatafieldAssessmentResultType createAsiMetadatafieldAssessmentResultType() {
        return new AsiMetadatafieldAssessmentResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension section result type
     */
    public ExtensionSectionResultType createExtensionSectionResultType() {
        return new ExtensionSectionResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the asi metadata item result type
     */
    public AsiMetadataItemResultType createAsiMetadataItemResultType() {
        return new AsiMetadataItemResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section result type
     */
    public SectionResultType createSectionResultType() {
        return new SectionResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the qti result report type
     */
    public QtiResultReportType createQtiResultReportType() {
        return new QtiResultReportType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the type label type
     */
    public TypeLabelType createTypeLabelType() {
        return new TypeLabelType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the outcomes assessment result type
     */
    public OutcomesAssessmentResultType createOutcomesAssessmentResultType() {
        return new OutcomesAssessmentResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension score type
     */
    public ExtensionScoreType createExtensionScoreType() {
        return new ExtensionScoreType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the qti comment type
     */
    public QtiCommentType createQtiCommentType() {
        return new QtiCommentType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the date type
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension summary result type
     */
    public ExtensionSummaryResultType createExtensionSummaryResultType() {
        return new ExtensionSummaryResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the response type
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension responseform type
     */
    public ExtensionResponseformType createExtensionResponseformType() {
        return new ExtensionResponseformType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the result type
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the feedback displayed type
     */
    public FeedbackDisplayedType createFeedbackDisplayedType() {
        return new FeedbackDisplayedType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension grade type
     */
    public ExtensionGradeType createExtensionGradeType() {
        return new ExtensionGradeType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the score item result outcomes type
     */
    public ScoreItemResultOutcomesType createScoreItemResultOutcomesType() {
        return new ScoreItemResultOutcomesType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the response value type
     */
    public ResponseValueType createResponseValueType() {
        return new ResponseValueType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the grade type
     */
    public GradeType createGradeType() {
        return new GradeType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the control type
     */
    public ControlType createControlType() {
        return new ControlType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the asi metadata assessment result type
     */
    public AsiMetadataAssessmentResultType createAsiMetadataAssessmentResultType() {
        return new AsiMetadataAssessmentResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension result type
     */
    public ExtensionResultType createExtensionResultType() {
        return new ExtensionResultType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the correct response type
     */
    public CorrectResponseType createCorrectResponseType() {
        return new CorrectResponseType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the score interpretation type
     */
    public ScoreInterpretationType createScoreInterpretationType() {
        return new ScoreInterpretationType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the vocabulary type
     */
    public VocabularyType createVocabularyType() {
        return new VocabularyType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the type label
     */
    public DateType.TypeLabel createDateTypeTypeLabel() {
        return new DateType.TypeLabel();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the score assessment result outcomes type
     */
    public ScoreAssessmentResultOutcomesType createScoreAssessmentResultOutcomesType() {
        return new ScoreAssessmentResultOutcomesType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the extension context type
     */
    public ExtensionContextType createExtensionContextType() {
        return new ExtensionContextType();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the type label
     */
    public StatusType.TypeLabel createStatusTypeTypeLabel() {
        return new StatusType.TypeLabel();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the status type
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension response type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_response")
    public JAXBElement<ExtensionResponseType> createExtensionResponse(ExtensionResponseType value) {
        return new JAXBElement<ExtensionResponseType>(_ExtensionResponse_QNAME, ExtensionResponseType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< control type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "control")
    public JAXBElement<ControlType> createControl(ControlType value) {
        return new JAXBElement<ControlType>(_Control_QNAME, ControlType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension section result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_section_result")
    public JAXBElement<ExtensionSectionResultType> createExtensionSectionResult(ExtensionSectionResultType value) {
        return new JAXBElement<ExtensionSectionResultType>(_ExtensionSectionResult_QNAME, ExtensionSectionResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< section result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "section_result")
    public JAXBElement<SectionResultType> createSectionResult(SectionResultType value) {
        return new JAXBElement<SectionResultType>(_SectionResult_QNAME, SectionResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< item result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "item_result")
    public JAXBElement<ItemResultType> createItemResult(ItemResultType value) {
        return new JAXBElement<ItemResultType>(_ItemResult_QNAME, ItemResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "field_name")
    public JAXBElement<String> createFieldName(String value) {
        return new JAXBElement<String>(_FieldName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_std_error")
    public JAXBElement<String> createScoreStdError(String value) {
        return new JAXBElement<String>(_ScoreStdError_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension grade type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_grade")
    public JAXBElement<ExtensionGradeType> createExtensionGrade(ExtensionGradeType value) {
        return new JAXBElement<ExtensionGradeType>(_ExtensionGrade_QNAME, ExtensionGradeType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_sections_presented")
    public JAXBElement<String> createNumSectionsPresented(String value) {
        return new JAXBElement<String>(_NumSectionsPresented_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< response type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_cut")
    public JAXBElement<String> createScoreCut(String value) {
        return new JAXBElement<String>(_ScoreCut_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< response form type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "response_form")
    public JAXBElement<ResponseFormType> createResponseForm(ResponseFormType value) {
        return new JAXBElement<ResponseFormType>(_ResponseForm_QNAME, ResponseFormType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< score interpretation type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_interpretation")
    public JAXBElement<ScoreInterpretationType> createScoreInterpretation(ScoreInterpretationType value) {
        return new JAXBElement<ScoreInterpretationType>(_ScoreInterpretation_QNAME, ScoreInterpretationType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< grade type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_score")
    public JAXBElement<GradeType> createExtensionScore(GradeType value) {
        return new JAXBElement<GradeType>(_ExtensionScore_QNAME, GradeType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "correct_response")
    public JAXBElement<String> createCorrectResponse(String value) {
        return new JAXBElement<String>(_CorrectResponse_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_reliability")
    public JAXBElement<String> createScoreReliability(String value) {
        return new JAXBElement<String>(_ScoreReliability_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_value")
    public JAXBElement<String> createScoreValue(String value) {
        return new JAXBElement<String>(_ScoreValue_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_min")
    public JAXBElement<String> createScoreMin(String value) {
        return new JAXBElement<String>(_ScoreMin_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< qti comment type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "qti_comment")
    public JAXBElement<QtiCommentType> createQtiComment(QtiCommentType value) {
        return new JAXBElement<QtiCommentType>(_QtiComment_QNAME, QtiCommentType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "datetime")
    public JAXBElement<String> createDatetime(String value) {
        return new JAXBElement<String>(_Datetime_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< date type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "date")
    public JAXBElement<DateType> createDate(DateType value) {
        return new JAXBElement<DateType>(_Date_QNAME, DateType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_attempts")
    public JAXBElement<String> createNumAttempts(String value) {
        return new JAXBElement<String>(_NumAttempts_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension assessment result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_assessment_result")
    public JAXBElement<ExtensionAssessmentResultType> createExtensionAssessmentResult(ExtensionAssessmentResultType value) {
        return new JAXBElement<ExtensionAssessmentResultType>(_ExtensionAssessmentResult_QNAME, ExtensionAssessmentResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< objective type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "objective")
    public JAXBElement<ObjectiveType> createObjective(ObjectiveType value) {
        return new JAXBElement<ObjectiveType>(_Objective_QNAME, ObjectiveType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< status type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension item result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_item_result")
    public JAXBElement<ExtensionItemResultType> createExtensionItemResult(ExtensionItemResultType value) {
        return new JAXBElement<ExtensionItemResultType>(_ExtensionItemResult_QNAME, ExtensionItemResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_average")
    public JAXBElement<String> createScoreAverage(String value) {
        return new JAXBElement<String>(_ScoreAverage_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< type label type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "type_label")
    public JAXBElement<TypeLabelType> createTypeLabel(TypeLabelType value) {
        return new JAXBElement<TypeLabelType>(_TypeLabel_QNAME, TypeLabelType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension responseform type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_responseform")
    public JAXBElement<ExtensionResponseformType> createExtensionResponseform(ExtensionResponseformType value) {
        return new JAXBElement<ExtensionResponseformType>(_ExtensionResponseform_QNAME, ExtensionResponseformType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< context type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "context")
    public JAXBElement<ContextType> createContext(ContextType value) {
        return new JAXBElement<ContextType>(_Context_QNAME, ContextType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< generic identifier type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "generic_identifier")
    public JAXBElement<GenericIdentifierType> createGenericIdentifier(GenericIdentifierType value) {
        return new JAXBElement<GenericIdentifierType>(_GenericIdentifier_QNAME, GenericIdentifierType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< vocabulary type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "vocabulary")
    public JAXBElement<VocabularyType> createVocabulary(VocabularyType value) {
        return new JAXBElement<VocabularyType>(_Vocabulary_QNAME, VocabularyType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_items_attempted")
    public JAXBElement<String> createNumItemsAttempted(String value) {
        return new JAXBElement<String>(_NumItemsAttempted_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "field_value")
    public JAXBElement<String> createFieldValue(String value) {
        return new JAXBElement<String>(_FieldValue_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension summary result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_summary_result")
    public JAXBElement<ExtensionSummaryResultType> createExtensionSummaryResult(ExtensionSummaryResultType value) {
        return new JAXBElement<ExtensionSummaryResultType>(_ExtensionSummaryResult_QNAME, ExtensionSummaryResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< response value type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "response_value")
    public JAXBElement<ResponseValueType> createResponseValue(ResponseValueType value) {
        return new JAXBElement<ResponseValueType>(_ResponseValue_QNAME, ResponseValueType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_result")
    public JAXBElement<ExtensionResultType> createExtensionResult(ExtensionResultType value) {
        return new JAXBElement<ExtensionResultType>(_ExtensionResult_QNAME, ExtensionResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_normalized")
    public JAXBElement<String> createScoreNormalized(String value) {
        return new JAXBElement<String>(_ScoreNormalized_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "durationType")
    public JAXBElement<String> createDurationType(String value) {
        return new JAXBElement<String>(_DurationType_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< asi description type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "asi_description")
    public JAXBElement<AsiDescriptionType> createAsiDescription(AsiDescriptionType value) {
        return new JAXBElement<AsiDescriptionType>(_AsiDescription_QNAME, AsiDescriptionType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< qti result report type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "qti_result_report")
    public JAXBElement<QtiResultReportType> createQtiResultReport(QtiResultReportType value) {
        return new JAXBElement<QtiResultReportType>(_QtiResultReport_QNAME, QtiResultReportType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< feedback displayed type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "feedback_displayed")
    public JAXBElement<FeedbackDisplayedType> createFeedbackDisplayed(FeedbackDisplayedType value) {
        return new JAXBElement<FeedbackDisplayedType>(_FeedbackDisplayed_QNAME, FeedbackDisplayedType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_items_presented")
    public JAXBElement<String> createNumItemsPresented(String value) {
        return new JAXBElement<String>(_NumItemsPresented_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< assessment result type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "assessment_result")
    public JAXBElement<AssessmentResultType> createAssessmentResult(AssessmentResultType value) {
        return new JAXBElement<AssessmentResultType>(_AssessmentResult_QNAME, AssessmentResultType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_sections")
    public JAXBElement<String> createNumSections(String value) {
        return new JAXBElement<String>(_NumSections_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_max")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createScoreMax(Long value) {
        return new JAXBElement<Long>(_ScoreMax_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< extension context type>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_context")
    public JAXBElement<ExtensionContextType> createExtensionContext(ExtensionContextType value) {
        return new JAXBElement<ExtensionContextType>(_ExtensionContext_QNAME, ExtensionContextType.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "status_value")
    public JAXBElement<String> createStatusValue(String value) {
        return new JAXBElement<String>(_StatusValue_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_items")
    public JAXBElement<String> createNumItems(String value) {
        return new JAXBElement<String>(_NumItems_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "identifier_string")
    public JAXBElement<String> createIdentifierString(String value) {
        return new JAXBElement<String>(_IdentifierString_QNAME, String.class, null, value);
    }

}
