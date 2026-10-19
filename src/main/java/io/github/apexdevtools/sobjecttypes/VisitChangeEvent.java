/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class VisitChangeEvent extends SObject {
	public static SObjectType$<VisitChangeEvent> SObjectType;
	public static SObjectFields$<VisitChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Datetime ActualVisitEndTime;
	public Datetime ActualVisitStartTime;
	public Id AddressId;
	public Address Address;
	public ChangeEventHeader ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id ContextId;
	public SObject Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public String InstructionDescription;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LocationId;
	public Location Location;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentVisitId;
	public Visit ParentVisit;
	public Id PlaceId;
	public SObject Place;
	public Datetime PlannedVisitEndTime;
	public Datetime PlannedVisitStartTime;
	public String ReplayId;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public String Status;
	public String StatusRemarks;
	public Id UserId;
	public User User;
	public String VisitPriority;
	public Id VisitTypeId;
	public SObject VisitType;
	public Id VisitorId;
	public SObject Visitor;

	public VisitChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VisitChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VisitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VisitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VisitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
