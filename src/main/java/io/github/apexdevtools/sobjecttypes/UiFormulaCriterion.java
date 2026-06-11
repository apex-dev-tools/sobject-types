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
public class UiFormulaCriterion extends SObject {
	public static SObjectType$<UiFormulaCriterion> SObjectType;
	public static SObjectFields$<UiFormulaCriterion> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LeftHandSide;
	public String OperatorId;
	public String ParentKeyPrefix;
	public String RightHandSide;
	public Id RuleId;
	public UiFormulaRule Rule;
	public Datetime SystemModstamp;

	public UiFormulaCriterion clone$() {throw new java.lang.UnsupportedOperationException();}
	public UiFormulaCriterion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UiFormulaCriterion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UiFormulaCriterion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UiFormulaCriterion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
