/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class PicklistValueInfo extends SObject {
	public static SObjectType$<PicklistValueInfo> SObjectType;
	public static SObjectFields$<PicklistValueInfo> Fields;

	public String DurableId;
	public String EntityParticleId;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDefaultValue;
	public String Label;
	public String ValidFor;
	public String Value;

	public PicklistValueInfo clone$() {throw new UnsupportedOperationException();}
	public PicklistValueInfo clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public PicklistValueInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public PicklistValueInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public PicklistValueInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
