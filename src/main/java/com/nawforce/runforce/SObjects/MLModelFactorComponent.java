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
public class MLModelFactorComponent extends SObject {
	public static SObjectType$<MLModelFactorComponent> SObjectType;
	public static SObjectFields$<MLModelFactorComponent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FactorLabelKey;
	public String FeatureType;
	public String FeatureValue;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LeftHandDerivedField;
	public Id ModelFactorId;
	public MLModelFactor ModelFactor;
	public Id ModelId;
	public MLModel Model;
	public String Name;
	public String Operator;
	public String RightHandDerivedField;
	public Integer SortOrder;
	public Datetime SystemModstamp;
	public String Value;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public MLModelFactorComponent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MLModelFactorComponent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MLModelFactorComponent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MLModelFactorComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MLModelFactorComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
