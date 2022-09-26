/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class NavigationMenuItem extends SObject {
	public static SObjectType$<NavigationMenuItem> SObjectType;
	public static SObjectFields$<NavigationMenuItem> Fields;

	public String AccessRestriction;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DefaultListViewId;
	public ListView DefaultListView;
	public Id DraftRowId;
	public NavigationMenuItem DraftRow;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NavigationLinkSetId;
	public NavigationLinkSet NavigationLinkSet;
	public Id ParentId;
	public NavigationMenuItem Parent;
	public Integer Position;
	public String Status;
	public Datetime SystemModstamp;
	public String Target;
	public String TargetPrefs;
	public String Type;

	public CustomBrand[] CustomBrands;
	public NavigationMenuItemLocalization[] Localization;

	public NavigationMenuItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public NavigationMenuItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NavigationMenuItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NavigationMenuItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NavigationMenuItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
