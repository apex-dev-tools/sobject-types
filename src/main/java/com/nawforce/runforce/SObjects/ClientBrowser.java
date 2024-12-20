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
