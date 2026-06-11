/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WebLink extends SObject {
	public static SObjectType$<WebLink> SObjectType;
	public static SObjectFields$<WebLink> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DisplayType;
	public String EncodingKey;
	public Boolean HasMenubar;
	public Boolean HasScrollbars;
	public Boolean HasToolbar;
	public Integer Height;
	public Id Id;
	public Boolean IsProtected;
	public Boolean IsResizable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LinkType;
	public String MasterLabel;
	public String Name;
	public String NamespacePrefix;
	public String OpenType;
	public String PageOrSobjectType;
	public String Position;
	public Boolean RequireRowSelection;
	public Id ScontrolId;
	public SObject Scontrol;
	public Boolean ShowsLocation;
	public Boolean ShowsStatus;
	public Datetime SystemModstamp;
	public String Url;
	public Integer Width;

	public WebLinkLocalization[] Localization;

	public WebLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebLink clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
