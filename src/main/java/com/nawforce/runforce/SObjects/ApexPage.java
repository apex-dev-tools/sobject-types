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
public class ApexPage extends SObject {
	public static SObjectType$<ApexPage> SObjectType;
	public static SObjectFields$<ApexPage> Fields;

	public Decimal ApiVersion;
	public String ControllerKey;
	public String ControllerType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsAvailableInTouch;
	public Boolean IsConfirmationTokenRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Markup;
	public String MasterLabel;
	public String Name;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public SetupEntityAccess[] SetupEntityAccessItems;

	public ApexPage clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexPage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexPage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexPage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexPage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
