/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CallCenter extends SObject {
	public static SObjectType$<CallCenter> SObjectType;
	public static SObjectFields$<CallCenter> Fields;

	public String AdapterUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomSettings;
	public Id Id;
	public String InternalName;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime SystemModstamp;
	public Decimal Version;

	public ContactCenterChannel[] ContactCenterChannels;

	public CallCenter clone$() {throw new java.lang.UnsupportedOperationException();}
	public CallCenter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CallCenter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CallCenter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CallCenter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
