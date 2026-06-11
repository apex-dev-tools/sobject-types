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
public class VerificationHistory extends SObject {
	public static SObjectType$<VerificationHistory> SObjectType;
	public static SObjectFields$<VerificationHistory> Fields;

	public String Activity;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer EventGroup;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoginGeoId;
	public LoginGeo LoginGeo;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String Policy;
	public String Remarks;
	public Id ResourceId;
	public ConnectedApplication Resource;
	public String SourceIp;
	public String Status;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String VerificationMethod;
	public Datetime VerificationTime;

	public VerificationHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public VerificationHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VerificationHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VerificationHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VerificationHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
