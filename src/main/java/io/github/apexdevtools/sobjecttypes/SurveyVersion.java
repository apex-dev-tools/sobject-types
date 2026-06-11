/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SurveyVersion extends SObject {
	public static SObjectType$<SurveyVersion> SObjectType;
	public static SObjectFields$<SurveyVersion> Fields;

	public Id BrandingSetId;
	public BrandingSet BrandingSet;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsTemplate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id SurveyId;
	public Survey Survey;
	public String SurveyStatus;
	public Id SurveyStyleSetId;
	public SurveyStyleSet SurveyStyleSet;
	public Datetime SystemModstamp;
	public Integer VersionNumber;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SurveyPage[] SurveyPages;
	public SurveyQuestionScore[] SurveyQuestionScores;
	public SurveyQuestion[] SurveyQuestions;
	public SurveyResponse[] SurveyResponses;

	public SurveyVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
