/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SurveySubject extends SObject {
	public static SObjectType$<SurveySubject> SObjectType;
	public static SObjectFields$<SurveySubject> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ParentId;
	public Name Parent;
	public String SubjectEntityType;
	public Id SubjectId;
	public SObject Subject;
	public Id SurveyId;
	public Survey Survey;
	public Id SurveyInvitationId;
	public SurveyInvitation SurveyInvitation;
	public Id SurveyResponseId;
	public SurveyResponse SurveyResponse;
	public Datetime SystemModstamp;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public SurveySubject clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveySubject clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveySubject clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveySubject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveySubject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
