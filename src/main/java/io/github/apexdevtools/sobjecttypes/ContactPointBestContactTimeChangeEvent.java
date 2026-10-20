/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContactPointBestContactTimeChangeEvent extends SObject {
	public static SObjectType$<ContactPointBestContactTimeChangeEvent> SObjectType;
	public static SObjectFields$<ContactPointBestContactTimeChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String BestTimeType;
	public ChangeEventHeader ChangeEventHeader;
	public Id ContactPointReferenceId;
	public ContactPointAddress ContactPointReference;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DayOfWeek;
	public Time FromTime;
	public Integer FromTimeHours;
	public Decimal FromTimeInHours;
	public Integer FromTimeMinutes;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SourceSystemIdentifier;
	public String SourceSystemName;
	public Time ToTime;
	public Integer ToTimeHours;
	public Integer ToTimeMinutes;

	public ContactPointBestContactTimeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointBestContactTimeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointBestContactTimeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointBestContactTimeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointBestContactTimeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
