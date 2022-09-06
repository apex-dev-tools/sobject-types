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
public class ServiceCrewMemberChangeEvent extends SObject {
	public static SObjectType$<ServiceCrewMemberChangeEvent> SObjectType;
	public static SObjectFields$<ServiceCrewMemberChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDate;
	public Id Id;
	public Boolean IsLeader;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReplayId;
	public Id ServiceCrewId;
	public ServiceCrew ServiceCrew;
	public String ServiceCrewMemberNumber;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Datetime StartDate;

	public ServiceCrewMemberChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceCrewMemberChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceCrewMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceCrewMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceCrewMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
