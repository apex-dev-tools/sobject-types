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
public class ContactPointPhoneChangeEvent extends SObject {
	public static SObjectType$<ContactPointPhoneChangeEvent> SObjectType;
	public static SObjectFields$<ContactPointPhoneChangeEvent> Fields;

	public Date ActiveFromDate;
	public Date ActiveToDate;
	public String AreaCode;
	public Time BestTimeToContactEndTime;
	public Time BestTimeToContactStartTime;
	public String BestTimeToContactTimezone;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExtensionNumber;
	public String FormattedInternationalPhoneNumber;
	public String FormattedNationalPhoneNumber;
	public Id Id;
	public Boolean IsBusinessPhone;
	public Boolean IsFaxCapable;
	public Boolean IsPersonalPhone;
	public Boolean IsPrimary;
	public Boolean IsSmsCapable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public SObject Parent;
	public String PhoneType;
	public Integer PreferenceRank;
	public String ReplayId;
	public String TelephoneNumber;
	public String UsageType;

	public ContactPointPhoneChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
