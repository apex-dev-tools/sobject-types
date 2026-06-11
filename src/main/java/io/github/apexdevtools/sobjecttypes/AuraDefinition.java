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
public class AuraDefinition extends SObject {
	public static SObjectType$<AuraDefinition> SObjectType;
	public static SObjectFields$<AuraDefinition> Fields;

	public Id AuraDefinitionBundleId;
	public AuraDefinitionBundle AuraDefinitionBundle;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefType;
	public String Format;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Source;
	public Datetime SystemModstamp;

	public AuraDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
