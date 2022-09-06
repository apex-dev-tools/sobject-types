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
public class DataStatistics extends SObject {
	public static SObjectType$<DataStatistics> SObjectType;
	public static SObjectFields$<DataStatistics> Fields;

	public String ExternalId;
	public Id Id;
	public String StatType;
	public Integer StatValue;
	public String Type;
	public Id UserId;
	public User User;

	public DataStatistics clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataStatistics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataStatistics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataStatistics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataStatistics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
