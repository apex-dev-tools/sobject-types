/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareProgramEligibilityRuleChangeEvent extends SObject {
	public static SObjectType$<CareProgramEligibilityRuleChangeEvent> SObjectType;
	public static SObjectFields$<CareProgramEligibilityRuleChangeEvent> Fields;

	public Id CareProgramId;
	public CareProgram CareProgram;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EligibilityCriteriaId;
	public EnrollmentEligibilityCriteria EligibilityCriteria;
	public Id Id;
	public Boolean IsInclusionRule;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public String Type;

	public CareProgramEligibilityRuleChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEligibilityRuleChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEligibilityRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEligibilityRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEligibilityRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
