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
public class QuickTextUsage extends SObject {
	public static SObjectType$<QuickTextUsage> SObjectType;
	public static SObjectFields$<QuickTextUsage> Fields;

	public String AppContext;
	public String Channel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LaunchSource;
	public Datetime LoggedTime;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id QuickTextId;
	public QuickText QuickText;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public QuickTextUsageShare[] Shares;

	public QuickTextUsage clone$() {throw new java.lang.UnsupportedOperationException();}
	public QuickTextUsage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public QuickTextUsage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public QuickTextUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public QuickTextUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
