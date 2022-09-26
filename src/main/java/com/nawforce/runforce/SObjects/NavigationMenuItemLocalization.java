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
public class NavigationMenuItemLocalization extends SObject {
	public static SObjectType$<NavigationMenuItemLocalization> SObjectType;
	public static SObjectFields$<NavigationMenuItemLocalization> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String NamespacePrefix;
	public Id ParentId;
	public NavigationMenuItem Parent;
	public Datetime SystemModstamp;
	public String Value;

	public NavigationMenuItemLocalization clone$() {throw new java.lang.UnsupportedOperationException();}
	public NavigationMenuItemLocalization clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NavigationMenuItemLocalization clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NavigationMenuItemLocalization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NavigationMenuItemLocalization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
