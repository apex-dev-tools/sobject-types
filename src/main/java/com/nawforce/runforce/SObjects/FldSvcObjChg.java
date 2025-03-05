/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FldSvcObjChg extends SObject {
	public static SObjectType$<FldSvcObjChg> SObjectType;
	public static SObjectFields$<FldSvcObjChg> Fields;

	public String Activity;
	public String ActivityDetails;
	public Datetime ActivityTimeStamp;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OriginalSvcAppointment;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public Datetime SystemModstamp;
	public String TimeZone;
	public String Transaction;
	public Id UserId;
	public User User;

	public FldSvcObjChgDtl[] FldSvcObjChgDtls;

	public FldSvcObjChg clone$() {throw new java.lang.UnsupportedOperationException();}
	public FldSvcObjChg clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FldSvcObjChg clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FldSvcObjChg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FldSvcObjChg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
