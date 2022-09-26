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
