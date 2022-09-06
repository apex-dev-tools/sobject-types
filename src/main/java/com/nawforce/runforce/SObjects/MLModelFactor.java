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
