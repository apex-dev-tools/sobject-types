/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class OrgEmailAddressSecurity extends SObject {
	public static SObjectType$<OrgEmailAddressSecurity> SObjectType;
	public static SObjectFields$<OrgEmailAddressSecurity> Fields;

	public Id Id;
	public Id OrgWideEmailAddressId;
	public OrgWideEmailAddress OrgWideEmailAddress;
	public Id ParentId;
	public Profile Parent;
	public Datetime SystemModstamp;

	public OrgEmailAddressSecurity clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrgEmailAddressSecurity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrgEmailAddressSecurity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrgEmailAddressSecurity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrgEmailAddressSecurity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
