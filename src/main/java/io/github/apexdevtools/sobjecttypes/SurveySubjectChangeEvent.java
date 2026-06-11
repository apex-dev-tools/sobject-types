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
public class SurveySubjectChangeEvent extends SObject {
	public static SObjectType$<SurveySubjectChangeEvent> SObjectType;
	public static SObjectFields$<SurveySubjectChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentId;
	public SObject Parent;
	public String ReplayId;
	public String SubjectEntityType;
	public Id SubjectId;
	public SObject Subject;
	public Id SurveyId;
	public Survey Survey;
	public Id SurveyInvitationId;
	public SurveyInvitation SurveyInvitation;
	public Id SurveyResponseId;
	public SurveyResponse SurveyResponse;

	public SurveySubjectChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveySubjectChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveySubjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveySubjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveySubjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
