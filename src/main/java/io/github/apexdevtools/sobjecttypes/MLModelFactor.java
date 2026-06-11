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
public class MLModelFactor extends SObject {
	public static SObjectType$<MLModelFactor> SObjectType;
	public static SObjectFields$<MLModelFactor> Fields;

	public Decimal Correlation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FactorType;
	public Id Id;
	public Decimal Importance;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ModelId;
	public MLModel Model;
	public String Name;
	public Datetime SystemModstamp;
	public String Type;
	public Decimal Weight;

	public MLModelFactorComponent[] MLModelFactorComponents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public MLModelFactor clone$() {throw new java.lang.UnsupportedOperationException();}
	public MLModelFactor clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MLModelFactor clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MLModelFactor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MLModelFactor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
