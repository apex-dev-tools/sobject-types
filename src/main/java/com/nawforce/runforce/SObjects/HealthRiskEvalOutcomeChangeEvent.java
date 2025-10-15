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
public class HealthRiskEvalOutcomeChangeEvent extends SObject {
	public static SObjectType$<HealthRiskEvalOutcomeChangeEvent> SObjectType;
	public static SObjectFields$<HealthRiskEvalOutcomeChangeEvent> Fields;

	public String AdditionalInformation;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id HealthRiskEvaluationId;
	public HealthRiskEvaluation HealthRiskEvaluation;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MaximumRiskProbabilityValue;
	public Decimal MinimumRiskProbabilityValue;
	public String Name;
	public String ReplayId;
	public Id RiskCodeSetValueId;
	public SObject RiskCodeSetValue;
	public Datetime RiskEndDateTime;
	public Decimal RiskNumericValue;
	public Id RiskOutcomeCodeId;
	public SObject RiskOutcomeCode;
	public Decimal RiskRangeMaximumValue;
	public Decimal RiskRangeMinimumValue;
	public Id RiskRangeUomId;
	public UnitOfMeasure RiskRangeUom;
	public Datetime RiskStartDateTime;
	public String RiskValueType;

	public HealthRiskEvalOutcomeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvalOutcomeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvalOutcomeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvalOutcomeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvalOutcomeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
