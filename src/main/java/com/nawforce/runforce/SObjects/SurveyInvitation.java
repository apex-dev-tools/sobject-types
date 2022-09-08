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
public class SurveyInvitation extends SObject {
	public static SObjectType$<SurveyInvitation> SObjectType;
	public static SObjectFields$<SurveyInvitation> Fields;

	public Id CommunityId;
	public Network Community;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EmailBrandingId;
	public SurveyEmailBranding EmailBranding;
	public Id Id;
	public String InvitationLink;
	public Datetime InviteExpiryDateTime;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LeadId;
	public Lead Lead;
	public String Name;
	public Boolean OptionsAllowGuestUserResponse;
	public Boolean OptionsAllowParticipantAccessTheirResponse;
	public Boolean OptionsCollectAnonymousResponse;
	public Id OwnerId;
	public Name Owner;
	public Id ParticipantId;
	public Name Participant;
	public String ResponseStatus;
	public Id SurveyId;
	public Survey Survey;
	public Datetime SystemModstamp;
	public String UUID;
	public Id UserId;
	public User User;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SurveyInvitationShare[] Shares;
	public SurveyQuestionScore[] SurveyQuestionScores;
	public SurveyResponse[] SurveyResponses;
	public SurveySubject[] SurveySubjectInvitation;
	public SurveySubject[] SurveySubjects;

	public SurveyInvitation clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
