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
public class CronTrigger extends SObject {
	public static SObjectType$<CronTrigger> SObjectType;
	public static SObjectFields$<CronTrigger> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CronExpression;
	public Id CronJobDetailId;
	public CronJobDetail CronJobDetail;
	public Datetime EndTime;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime NextFireTime;
	public Id OwnerId;
	public User Owner;
	public Datetime PreviousFireTime;
	public Datetime StartTime;
	public String State;
	public String TimeZoneSidKey;
	public Integer TimesTriggered;

	public CronTrigger clone$() {throw new java.lang.UnsupportedOperationException();}
	public CronTrigger clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CronTrigger clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CronTrigger clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CronTrigger clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
