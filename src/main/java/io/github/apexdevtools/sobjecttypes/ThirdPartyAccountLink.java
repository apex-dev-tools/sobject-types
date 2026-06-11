/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ThirdPartyAccountLink extends SObject {
	public static SObjectType$<ThirdPartyAccountLink> SObjectType;
	public static SObjectFields$<ThirdPartyAccountLink> Fields;

	public String Handle;
	public Id Id;
	public Boolean IsNotSsoUsable;
	public String Provider;
	public String RemoteIdentifier;
	public Id SsoProviderId;
	public AuthProvider SsoProvider;
	public String SsoProviderName;
	public String ThirdPartyAccountLinkKey;
	public Id UserId;
	public User User;

	public ThirdPartyAccountLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public ThirdPartyAccountLink clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ThirdPartyAccountLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ThirdPartyAccountLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ThirdPartyAccountLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
