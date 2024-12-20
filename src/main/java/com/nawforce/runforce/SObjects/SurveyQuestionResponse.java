/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SurveyQuestionResponse extends SObject {
	public static SObjectType$<SurveyQuestionResponse> SObjectType;
	public static SObjectFields$<SurveyQuestionResponse> Fields;

	public String ChoiceValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Datatype;
	public Datetime DateTimeValue;
	public Date DateValue;
	public Id Id;
	public Id InvitationId;
	public SurveyInvitation Invitation;
	public Boolean IsDeleted;
	public Boolean IsTrueOrFalse;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer NumberValue;
	public Id QuestionChoiceId;
	public SurveyQuestionChoice QuestionChoice;
	public Id QuestionId;
	public SurveyQuestion Question;
	public Integer Rank;
	public Id ResponseId;
	public SurveyResponse Response;
	public String ResponseShortText;
	public String ResponseValue;
	public Id SurveyVersionId;
	public SurveyVersion SurveyVersion;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TopicAssignment[] TopicAssignments;

	public SurveyQuestionResponse clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionResponse clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionResponse clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionResponse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionResponse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
