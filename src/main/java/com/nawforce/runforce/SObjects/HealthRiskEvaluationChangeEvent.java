/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class HealthRiskEvaluationChangeEvent extends SObject {
	public static SObjectType$<HealthRiskEvaluationChangeEvent> SObjectType;
	public static SObjectFields$<HealthRiskEvaluationChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDateTime;
	public Id EvaluatorId;
	public SObject Evaluator;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MethodCodeId;
	public SObject MethodCode;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PrimaryHealthConditionId;
	public HealthCondition PrimaryHealthCondition;
	public String ReplayId;
	public String RiskMitigationInfo;
	public Datetime StartDateTime;
	public String Status;
	public Id SubjectId;
	public Account Subject;
	public Id TypeCodeId;
	public SObject TypeCode;

	public HealthRiskEvaluationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvaluationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvaluationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvaluationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvaluationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
