/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SurveyInvitationChangeEvent extends SObject {
	public static SObjectType$<SurveyInvitationChangeEvent> SObjectType;
	public static SObjectFields$<SurveyInvitationChangeEvent> Fields;

	public Object ChangeEventHeader;
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
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LeadId;
	public Lead Lead;
	public String Name;
	public Boolean OptionsAllowGuestUserResponse;
	public Boolean OptionsAllowParticipantAccessTheirResponse;
	public Boolean OptionsCollectAnonymousResponse;
	public Id OwnerId;
	public User Owner;
	public Id ParticipantId;
	public SObject Participant;
	public String ReplayId;
	public String ResponseStatus;
	public Id SurveyId;
	public Survey Survey;
	public String UUID;
	public Id UserId;
	public User User;

	public SurveyInvitationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyInvitationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
