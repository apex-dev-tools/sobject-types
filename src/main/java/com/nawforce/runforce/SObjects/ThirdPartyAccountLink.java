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

	public ThirdPartyAccountLink clone$() {throw new UnsupportedOperationException();}
	public ThirdPartyAccountLink clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public ThirdPartyAccountLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public ThirdPartyAccountLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public ThirdPartyAccountLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
