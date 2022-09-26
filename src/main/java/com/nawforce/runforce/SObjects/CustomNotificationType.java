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
public class CustomNotificationType extends SObject {
	public static SObjectType$<CustomNotificationType> SObjectType;
	public static SObjectFields$<CustomNotificationType> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomNotifTypeName;
	public String Description;
	public Boolean Desktop;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSlack;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Boolean Mobile;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public CustomNotificationType clone$() {throw new java.lang.UnsupportedOperationException();}
	public CustomNotificationType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CustomNotificationType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CustomNotificationType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CustomNotificationType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
