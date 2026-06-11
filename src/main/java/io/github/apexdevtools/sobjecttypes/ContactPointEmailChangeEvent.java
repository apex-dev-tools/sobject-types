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
public class ContactPointEmailChangeEvent extends SObject {
	public static SObjectType$<ContactPointEmailChangeEvent> SObjectType;
	public static SObjectFields$<ContactPointEmailChangeEvent> Fields;

	public Date ActiveFromDate;
	public Date ActiveToDate;
	public Time BestTimeToContactEndTime;
	public Time BestTimeToContactStartTime;
	public String BestTimeToContactTimezone;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EmailAddress;
	public String EmailDomain;
	public Datetime EmailLatestBounceDateTime;
	public String EmailLatestBounceReasonText;
	public String EmailMailBox;
	public Id Id;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public SObject Parent;
	public Integer PreferenceRank;
	public String ReplayId;
	public String UsageType;

	public ContactPointEmailChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointEmailChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointEmailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointEmailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointEmailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
