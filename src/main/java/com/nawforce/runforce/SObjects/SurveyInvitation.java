/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SurveyInvitation extends SObject {
	public static SObjectType$<SurveyInvitation> SObjectType;
	public static SObjectFields$<SurveyInvitation> Fields;

	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id EmailBrandingId;
	public SurveyEmailBranding EmailBranding;
	public Id Id;
	public com.nawforce.runforce.System.String InvitationLink;
	public Datetime InviteExpiryDateTime;
	public com.nawforce.runforce.System.Boolean IsDefault;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LeadId;
	public Lead Lead;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Boolean OptionsAllowGuestUserResponse;
	public com.nawforce.runforce.System.Boolean OptionsAllowParticipantAccessTheirResponse;
	public com.nawforce.runforce.System.Boolean OptionsCollectAnonymousResponse;
	public Id OwnerId;
	public Name Owner;
	public Id ParticipantId;
	public Name Participant;
	public com.nawforce.runforce.System.String ResponseStatus;
	public Id SurveyId;
	public Survey Survey;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String UUID;
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
	public SurveyInvitation clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitation clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitation clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitation clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
