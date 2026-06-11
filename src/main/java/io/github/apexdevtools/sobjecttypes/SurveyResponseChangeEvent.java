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
public class SurveyResponseChangeEvent extends SObject {
	public static SObjectType$<SurveyResponseChangeEvent> SObjectType;
	public static SObjectFields$<SurveyResponseChangeEvent> Fields;

	public Object ChangeEventHeader;
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
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Location Location;
	public Decimal Longitude;
	public String Name;
	public String ReplayId;
	public String Status;
	public Id SubmitterId;
	public SObject Submitter;
	public Id SurveyId;
	public Survey Survey;
	public Id SurveyVersionId;
	public SurveyVersion SurveyVersion;

	public SurveyResponseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyResponseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyResponseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyResponseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyResponseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
