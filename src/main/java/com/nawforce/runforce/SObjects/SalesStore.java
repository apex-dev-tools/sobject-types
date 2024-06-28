/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class SalesStore extends SObject {
	public static SObjectType$<SalesStore> SObjectType;
	public static SObjectFields$<SalesStore> Fields;

	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public String ImplementorType;
	public Id LocationId;
	public Location Location;
	public String Name;

	public SalesStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public SalesStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SalesStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SalesStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SalesStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
