/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SurveyResponse extends SObject {
	public static SObjectType$<SurveyResponse> SObjectType;
	public static SObjectFields$<SurveyResponse> Fields;

	public Datetime CompletionDateTime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public String InterviewGuid;
	public Id InterviewId;
	public FlowInterview Interview;
	public Id InvitationId;
	public SurveyInvitation Invitation;
	public String IpAddress;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Location Location;
	public Decimal Longitude;
	public String Name;
	public String Status;
	public Id SubmitterId;
	public Name Submitter;
	public Id SurveyId;
	public Survey Survey;
	public Id SurveyVersionId;
	public SurveyVersion SurveyVersion;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SurveyQuestionResponse[] SurveyQuestionResponses;
	public SurveySubject[] SurveySubjectResponse;
	public SurveySubject[] SurveySubjects;

	public SurveyResponse clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyResponse clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyResponse clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyResponse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyResponse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
