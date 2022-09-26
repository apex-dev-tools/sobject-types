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
public class SurveyQuestionChoice extends SObject {
	public static SObjectType$<SurveyQuestionChoice> SObjectType;
	public static SObjectFields$<SurveyQuestionChoice> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDeprecated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id QuestionId;
	public SurveyQuestion Question;
	public Id SurveyVersionId;
	public SurveyVersion SurveyVersion;
	public Datetime SystemModstamp;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SurveyQuestionScore[] SurveyQuestionScores;
	public TopicAssignment[] TopicAssignments;

	public SurveyQuestionChoice clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionChoice clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionChoice clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionChoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyQuestionChoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
