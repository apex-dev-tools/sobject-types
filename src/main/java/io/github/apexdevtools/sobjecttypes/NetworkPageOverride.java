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
public class NetworkPageOverride extends SObject {
	public static SObjectType$<NetworkPageOverride> SObjectType;
	public static SObjectFields$<NetworkPageOverride> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NetworkId;
	public Network Network;
	public String OverrideSetting;
	public String OverrideType;
	public Datetime SystemModstamp;

	public NetworkPageOverride clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkPageOverride clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkPageOverride clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkPageOverride clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkPageOverride clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
