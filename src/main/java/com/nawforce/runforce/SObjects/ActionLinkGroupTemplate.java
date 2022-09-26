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
