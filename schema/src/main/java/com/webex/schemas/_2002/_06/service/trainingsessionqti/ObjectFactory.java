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
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webex.schemas._2002._06.service.trainingsessionqti package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExtensionResponse_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_response");
    private final static QName _Control_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "control");
    private final static QName _ExtensionSectionResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_section_result");
    private final static QName _SectionResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "section_result");
    private final static QName _ItemResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "item_result");
    private final static QName _FieldName_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "field_name");
    private final static QName _ScoreStdError_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_std_error");
    private final static QName _ExtensionGrade_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_grade");
    private final static QName _NumSectionsPresented_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_sections_presented");
    private final static QName _Response_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "response");
    private final static QName _Name_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "name");
    private final static QName _Result_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "result");
    private final static QName _ScoreCut_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_cut");
    private final static QName _ResponseForm_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "response_form");
    private final static QName _ScoreInterpretation_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_interpretation");
    private final static QName _ExtensionScore_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_score");
    private final static QName _CorrectResponse_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "correct_response");
    private final static QName _ScoreReliability_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_reliability");
    private final static QName _ScoreValue_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_value");
    private final static QName _ScoreMin_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_min");
    private final static QName _QtiComment_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "qti_comment");
    private final static QName _Datetime_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "datetime");
    private final static QName _Date_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "date");
    private final static QName _NumAttempts_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_attempts");
    private final static QName _ExtensionAssessmentResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_assessment_result");
    private final static QName _Objective_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "objective");
    private final static QName _Status_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "status");
    private final static QName _ExtensionItemResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_item_result");
    private final static QName _ScoreAverage_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_average");
    private final static QName _TypeLabel_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "type_label");
    private final static QName _ExtensionResponseform_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_responseform");
    private final static QName _Context_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "context");
    private final static QName _GenericIdentifier_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "generic_identifier");
    private final static QName _Vocabulary_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "vocabulary");
    private final static QName _NumItemsAttempted_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_items_attempted");
    private final static QName _FieldValue_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "field_value");
    private final static QName _ExtensionSummaryResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_summary_result");
    private final static QName _ResponseValue_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "response_value");
    private final static QName _ExtensionResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_result");
    private final static QName _ScoreNormalized_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_normalized");
    private final static QName _DurationType_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "durationType");
    private final static QName _AsiDescription_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "asi_description");
    private final static QName _QtiResultReport_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "qti_result_report");
    private final static QName _FeedbackDisplayed_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "feedback_displayed");
    private final static QName _NumItemsPresented_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_items_presented");
    private final static QName _AssessmentResult_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "assessment_result");
    private final static QName _NumSections_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_sections");
    private final static QName _ScoreMax_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "score_max");
    private final static QName _ExtensionContext_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "extension_context");
    private final static QName _StatusValue_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "status_value");
    private final static QName _NumItems_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "num_items");
    private final static QName _IdentifierString_QNAME = new QName("http://www.webex.com/schemas/2002/06/service/trainingsessionqti", "identifier_string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webex.schemas._2002._06.service.trainingsessionqti
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SectionResultType }
     * 
     */
    public SectionResultType createSectionResultType() {
        return new SectionResultType();
    }

    /**
     * Create an instance of {@link ControlType }
     * 
     */
    public ControlType createControlType() {
        return new ControlType();
    }

    /**
     * Create an instance of {@link AsiMetadataItemResultType }
     * 
     */
    public AsiMetadataItemResultType createAsiMetadataItemResultType() {
        return new AsiMetadataItemResultType();
    }

    /**
     * Create an instance of {@link ScoreAssessmentResultOutcomesType }
     * 
     */
    public ScoreAssessmentResultOutcomesType createScoreAssessmentResultOutcomesType() {
        return new ScoreAssessmentResultOutcomesType();
    }

    /**
     * Create an instance of {@link OutcomesItemResultType }
     * 
     */
    public OutcomesItemResultType createOutcomesItemResultType() {
        return new OutcomesItemResultType();
    }

    /**
     * Create an instance of {@link AsiDescriptionType }
     * 
     */
    public AsiDescriptionType createAsiDescriptionType() {
        return new AsiDescriptionType();
    }

    /**
     * Create an instance of {@link GenericIdentifierType }
     * 
     */
    public GenericIdentifierType createGenericIdentifierType() {
        return new GenericIdentifierType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link ContextType }
     * 
     */
    public ContextType createContextType() {
        return new ContextType();
    }

    /**
     * Create an instance of {@link StatusType.TypeLabel }
     * 
     */
    public StatusType.TypeLabel createStatusTypeTypeLabel() {
        return new StatusType.TypeLabel();
    }

    /**
     * Create an instance of {@link AsiMetadataAssessmentResultType }
     * 
     */
    public AsiMetadataAssessmentResultType createAsiMetadataAssessmentResultType() {
        return new AsiMetadataAssessmentResultType();
    }

    /**
     * Create an instance of {@link TypeLabelType }
     * 
     */
    public TypeLabelType createTypeLabelType() {
        return new TypeLabelType();
    }

    /**
     * Create an instance of {@link ResponseValueType }
     * 
     */
    public ResponseValueType createResponseValueType() {
        return new ResponseValueType();
    }

    /**
     * Create an instance of {@link ScoreInterpretationType }
     * 
     */
    public ScoreInterpretationType createScoreInterpretationType() {
        return new ScoreInterpretationType();
    }

    /**
     * Create an instance of {@link AsiMetadatafieldAssessmentResultType }
     * 
     */
    public AsiMetadatafieldAssessmentResultType createAsiMetadatafieldAssessmentResultType() {
        return new AsiMetadatafieldAssessmentResultType();
    }

    /**
     * Create an instance of {@link GradeType }
     * 
     */
    public GradeType createGradeType() {
        return new GradeType();
    }

    /**
     * Create an instance of {@link OutcomesAssessmentResultType }
     * 
     */
    public OutcomesAssessmentResultType createOutcomesAssessmentResultType() {
        return new OutcomesAssessmentResultType();
    }

    /**
     * Create an instance of {@link CorrectResponseType }
     * 
     */
    public CorrectResponseType createCorrectResponseType() {
        return new CorrectResponseType();
    }

    /**
     * Create an instance of {@link FeedbackDisplayedType }
     * 
     */
    public FeedbackDisplayedType createFeedbackDisplayedType() {
        return new FeedbackDisplayedType();
    }

    /**
     * Create an instance of {@link ExtensionContextType }
     * 
     */
    public ExtensionContextType createExtensionContextType() {
        return new ExtensionContextType();
    }

    /**
     * Create an instance of {@link ScoreItemResultOutcomesType }
     * 
     */
    public ScoreItemResultOutcomesType createScoreItemResultOutcomesType() {
        return new ScoreItemResultOutcomesType();
    }

    /**
     * Create an instance of {@link VocabularyType }
     * 
     */
    public VocabularyType createVocabularyType() {
        return new VocabularyType();
    }

    /**
     * Create an instance of {@link ExtensionSummaryResultType }
     * 
     */
    public ExtensionSummaryResultType createExtensionSummaryResultType() {
        return new ExtensionSummaryResultType();
    }

    /**
     * Create an instance of {@link ExtensionGradeType }
     * 
     */
    public ExtensionGradeType createExtensionGradeType() {
        return new ExtensionGradeType();
    }

    /**
     * Create an instance of {@link QtiCommentType }
     * 
     */
    public QtiCommentType createQtiCommentType() {
        return new QtiCommentType();
    }

    /**
     * Create an instance of {@link ExtensionResponseType }
     * 
     */
    public ExtensionResponseType createExtensionResponseType() {
        return new ExtensionResponseType();
    }

    /**
     * Create an instance of {@link ExtensionAssessmentResultType }
     * 
     */
    public ExtensionAssessmentResultType createExtensionAssessmentResultType() {
        return new ExtensionAssessmentResultType();
    }

    /**
     * Create an instance of {@link AsiMetadatafieldItemResultType }
     * 
     */
    public AsiMetadatafieldItemResultType createAsiMetadatafieldItemResultType() {
        return new AsiMetadatafieldItemResultType();
    }

    /**
     * Create an instance of {@link ResponseFormType }
     * 
     */
    public ResponseFormType createResponseFormType() {
        return new ResponseFormType();
    }

    /**
     * Create an instance of {@link ExtensionItemResultType }
     * 
     */
    public ExtensionItemResultType createExtensionItemResultType() {
        return new ExtensionItemResultType();
    }

    /**
     * Create an instance of {@link AssessmentResultType }
     * 
     */
    public AssessmentResultType createAssessmentResultType() {
        return new AssessmentResultType();
    }

    /**
     * Create an instance of {@link DateType.TypeLabel }
     * 
     */
    public DateType.TypeLabel createDateTypeTypeLabel() {
        return new DateType.TypeLabel();
    }

    /**
     * Create an instance of {@link ExtensionSectionResultType }
     * 
     */
    public ExtensionSectionResultType createExtensionSectionResultType() {
        return new ExtensionSectionResultType();
    }

    /**
     * Create an instance of {@link ExtensionResponseformType }
     * 
     */
    public ExtensionResponseformType createExtensionResponseformType() {
        return new ExtensionResponseformType();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link ExtensionResultType }
     * 
     */
    public ExtensionResultType createExtensionResultType() {
        return new ExtensionResultType();
    }

    /**
     * Create an instance of {@link ObjectiveType }
     * 
     */
    public ObjectiveType createObjectiveType() {
        return new ObjectiveType();
    }

    /**
     * Create an instance of {@link NumSectionsType }
     * 
     */
    public NumSectionsType createNumSectionsType() {
        return new NumSectionsType();
    }

    /**
     * Create an instance of {@link ExtensionScoreType }
     * 
     */
    public ExtensionScoreType createExtensionScoreType() {
        return new ExtensionScoreType();
    }

    /**
     * Create an instance of {@link QtiResultReportType }
     * 
     */
    public QtiResultReportType createQtiResultReportType() {
        return new QtiResultReportType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link ItemResultType }
     * 
     */
    public ItemResultType createItemResultType() {
        return new ItemResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_response")
    public JAXBElement<ExtensionResponseType> createExtensionResponse(ExtensionResponseType value) {
        return new JAXBElement<ExtensionResponseType>(_ExtensionResponse_QNAME, ExtensionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "control")
    public JAXBElement<ControlType> createControl(ControlType value) {
        return new JAXBElement<ControlType>(_Control_QNAME, ControlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionSectionResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_section_result")
    public JAXBElement<ExtensionSectionResultType> createExtensionSectionResult(ExtensionSectionResultType value) {
        return new JAXBElement<ExtensionSectionResultType>(_ExtensionSectionResult_QNAME, ExtensionSectionResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "section_result")
    public JAXBElement<SectionResultType> createSectionResult(SectionResultType value) {
        return new JAXBElement<SectionResultType>(_SectionResult_QNAME, SectionResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "item_result")
    public JAXBElement<ItemResultType> createItemResult(ItemResultType value) {
        return new JAXBElement<ItemResultType>(_ItemResult_QNAME, ItemResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "field_name")
    public JAXBElement<String> createFieldName(String value) {
        return new JAXBElement<String>(_FieldName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_std_error")
    public JAXBElement<String> createScoreStdError(String value) {
        return new JAXBElement<String>(_ScoreStdError_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionGradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_grade")
    public JAXBElement<ExtensionGradeType> createExtensionGrade(ExtensionGradeType value) {
        return new JAXBElement<ExtensionGradeType>(_ExtensionGrade_QNAME, ExtensionGradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_sections_presented")
    public JAXBElement<String> createNumSectionsPresented(String value) {
        return new JAXBElement<String>(_NumSectionsPresented_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_cut")
    public JAXBElement<String> createScoreCut(String value) {
        return new JAXBElement<String>(_ScoreCut_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseFormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "response_form")
    public JAXBElement<ResponseFormType> createResponseForm(ResponseFormType value) {
        return new JAXBElement<ResponseFormType>(_ResponseForm_QNAME, ResponseFormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreInterpretationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_interpretation")
    public JAXBElement<ScoreInterpretationType> createScoreInterpretation(ScoreInterpretationType value) {
        return new JAXBElement<ScoreInterpretationType>(_ScoreInterpretation_QNAME, ScoreInterpretationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_score")
    public JAXBElement<GradeType> createExtensionScore(GradeType value) {
        return new JAXBElement<GradeType>(_ExtensionScore_QNAME, GradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "correct_response")
    public JAXBElement<String> createCorrectResponse(String value) {
        return new JAXBElement<String>(_CorrectResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_reliability")
    public JAXBElement<String> createScoreReliability(String value) {
        return new JAXBElement<String>(_ScoreReliability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_value")
    public JAXBElement<String> createScoreValue(String value) {
        return new JAXBElement<String>(_ScoreValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_min")
    public JAXBElement<String> createScoreMin(String value) {
        return new JAXBElement<String>(_ScoreMin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QtiCommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "qti_comment")
    public JAXBElement<QtiCommentType> createQtiComment(QtiCommentType value) {
        return new JAXBElement<QtiCommentType>(_QtiComment_QNAME, QtiCommentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "datetime")
    public JAXBElement<String> createDatetime(String value) {
        return new JAXBElement<String>(_Datetime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "date")
    public JAXBElement<DateType> createDate(DateType value) {
        return new JAXBElement<DateType>(_Date_QNAME, DateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_attempts")
    public JAXBElement<String> createNumAttempts(String value) {
        return new JAXBElement<String>(_NumAttempts_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionAssessmentResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_assessment_result")
    public JAXBElement<ExtensionAssessmentResultType> createExtensionAssessmentResult(ExtensionAssessmentResultType value) {
        return new JAXBElement<ExtensionAssessmentResultType>(_ExtensionAssessmentResult_QNAME, ExtensionAssessmentResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "objective")
    public JAXBElement<ObjectiveType> createObjective(ObjectiveType value) {
        return new JAXBElement<ObjectiveType>(_Objective_QNAME, ObjectiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionItemResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_item_result")
    public JAXBElement<ExtensionItemResultType> createExtensionItemResult(ExtensionItemResultType value) {
        return new JAXBElement<ExtensionItemResultType>(_ExtensionItemResult_QNAME, ExtensionItemResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_average")
    public JAXBElement<String> createScoreAverage(String value) {
        return new JAXBElement<String>(_ScoreAverage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeLabelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "type_label")
    public JAXBElement<TypeLabelType> createTypeLabel(TypeLabelType value) {
        return new JAXBElement<TypeLabelType>(_TypeLabel_QNAME, TypeLabelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionResponseformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_responseform")
    public JAXBElement<ExtensionResponseformType> createExtensionResponseform(ExtensionResponseformType value) {
        return new JAXBElement<ExtensionResponseformType>(_ExtensionResponseform_QNAME, ExtensionResponseformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "context")
    public JAXBElement<ContextType> createContext(ContextType value) {
        return new JAXBElement<ContextType>(_Context_QNAME, ContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "generic_identifier")
    public JAXBElement<GenericIdentifierType> createGenericIdentifier(GenericIdentifierType value) {
        return new JAXBElement<GenericIdentifierType>(_GenericIdentifier_QNAME, GenericIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VocabularyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "vocabulary")
    public JAXBElement<VocabularyType> createVocabulary(VocabularyType value) {
        return new JAXBElement<VocabularyType>(_Vocabulary_QNAME, VocabularyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_items_attempted")
    public JAXBElement<String> createNumItemsAttempted(String value) {
        return new JAXBElement<String>(_NumItemsAttempted_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "field_value")
    public JAXBElement<String> createFieldValue(String value) {
        return new JAXBElement<String>(_FieldValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionSummaryResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_summary_result")
    public JAXBElement<ExtensionSummaryResultType> createExtensionSummaryResult(ExtensionSummaryResultType value) {
        return new JAXBElement<ExtensionSummaryResultType>(_ExtensionSummaryResult_QNAME, ExtensionSummaryResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "response_value")
    public JAXBElement<ResponseValueType> createResponseValue(ResponseValueType value) {
        return new JAXBElement<ResponseValueType>(_ResponseValue_QNAME, ResponseValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_result")
    public JAXBElement<ExtensionResultType> createExtensionResult(ExtensionResultType value) {
        return new JAXBElement<ExtensionResultType>(_ExtensionResult_QNAME, ExtensionResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_normalized")
    public JAXBElement<String> createScoreNormalized(String value) {
        return new JAXBElement<String>(_ScoreNormalized_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "durationType")
    public JAXBElement<String> createDurationType(String value) {
        return new JAXBElement<String>(_DurationType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsiDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "asi_description")
    public JAXBElement<AsiDescriptionType> createAsiDescription(AsiDescriptionType value) {
        return new JAXBElement<AsiDescriptionType>(_AsiDescription_QNAME, AsiDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QtiResultReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "qti_result_report")
    public JAXBElement<QtiResultReportType> createQtiResultReport(QtiResultReportType value) {
        return new JAXBElement<QtiResultReportType>(_QtiResultReport_QNAME, QtiResultReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedbackDisplayedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "feedback_displayed")
    public JAXBElement<FeedbackDisplayedType> createFeedbackDisplayed(FeedbackDisplayedType value) {
        return new JAXBElement<FeedbackDisplayedType>(_FeedbackDisplayed_QNAME, FeedbackDisplayedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_items_presented")
    public JAXBElement<String> createNumItemsPresented(String value) {
        return new JAXBElement<String>(_NumItemsPresented_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "assessment_result")
    public JAXBElement<AssessmentResultType> createAssessmentResult(AssessmentResultType value) {
        return new JAXBElement<AssessmentResultType>(_AssessmentResult_QNAME, AssessmentResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_sections")
    public JAXBElement<String> createNumSections(String value) {
        return new JAXBElement<String>(_NumSections_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "score_max")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createScoreMax(Long value) {
        return new JAXBElement<Long>(_ScoreMax_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionContextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "extension_context")
    public JAXBElement<ExtensionContextType> createExtensionContext(ExtensionContextType value) {
        return new JAXBElement<ExtensionContextType>(_ExtensionContext_QNAME, ExtensionContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "status_value")
    public JAXBElement<String> createStatusValue(String value) {
        return new JAXBElement<String>(_StatusValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "num_items")
    public JAXBElement<String> createNumItems(String value) {
        return new JAXBElement<String>(_NumItems_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webex.com/schemas/2002/06/service/trainingsessionqti", name = "identifier_string")
    public JAXBElement<String> createIdentifierString(String value) {
        return new JAXBElement<String>(_IdentifierString_QNAME, String.class, null, value);
    }

}
