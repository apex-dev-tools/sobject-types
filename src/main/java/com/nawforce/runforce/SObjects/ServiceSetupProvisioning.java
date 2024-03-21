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
public class ServiceSetupProvisioning extends SObject {
	public static SObjectType$<ServiceSetupProvisioning> SObjectType;
	public static SObjectFields$<ServiceSetupProvisioning> Fields;

	public Integer AttemptOrdinal;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public String JobName;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;
	public String TaskContext;
	public String TaskName;

	public ServiceSetupProvisioning clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceSetupProvisioning clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceSetupProvisioning clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceSetupProvisioning clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceSetupProvisioning clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
