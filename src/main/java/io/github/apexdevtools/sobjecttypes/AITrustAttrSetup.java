/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AITrustAttrSetup extends SObject {
	public static SObjectType$<AITrustAttrSetup> SObjectType;
	public static SObjectFields$<AITrustAttrSetup> Fields;

	public Id AttributeId;
	public AITrustAttribute Attribute;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Boolean IsLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Scope;
	public String SourceObject;
	public Datetime SystemModstamp;
	public String TrustAttribute;

	public AITrustAttrSetup clone$() {throw new java.lang.UnsupportedOperationException();}
	public AITrustAttrSetup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AITrustAttrSetup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AITrustAttrSetup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AITrustAttrSetup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
