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
public class SiteDetail extends SObject {
	public static SObjectType$<SiteDetail> SObjectType;
	public static SObjectFields$<SiteDetail> Fields;

	public String DurableId;
	public Id Id;
	public Boolean IsRegistrationEnabled;
	public String SecureUrl;

	public SiteDetail clone$() {throw new UnsupportedOperationException();}
	public SiteDetail clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public SiteDetail clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public SiteDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public SiteDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
