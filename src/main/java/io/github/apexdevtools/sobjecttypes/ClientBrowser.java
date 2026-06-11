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
public class ClientBrowser extends SObject {
	public static SObjectType$<ClientBrowser> SObjectType;
	public static SObjectFields$<ClientBrowser> Fields;

	public Datetime CreatedDate;
	public String FullUserAgent;
	public Id Id;
	public Datetime LastUpdate;
	public String ProxyInfo;
	public Id UsersId;
	public User Users;

	public ClientBrowser clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClientBrowser clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClientBrowser clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClientBrowser clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClientBrowser clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
