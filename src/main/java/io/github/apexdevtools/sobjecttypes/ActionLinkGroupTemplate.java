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
public class ActionLinkGroupTemplate extends SObject {
	public static SObjectType$<ActionLinkGroupTemplate> SObjectType;
	public static SObjectFields$<ActionLinkGroupTemplate> Fields;

	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String ExecutionsAllowed;
	public Integer HoursUntilExpiration;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPublished;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public ActionLinkTemplate[] ActionLinkTemplates;

	public ActionLinkGroupTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkGroupTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkGroupTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkGroupTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkGroupTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
