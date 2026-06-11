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
