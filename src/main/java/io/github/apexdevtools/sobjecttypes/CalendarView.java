/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CalendarView extends SObject {
	public static SObjectFields$<CalendarView> Fields;

	public String Color;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DateHandlingType;
	public String DisplayField;
	public String EndField;
	public String FillPattern;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDisplayed;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ListViewFilterId;
	public ListView ListViewFilter;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PublisherId;
	public Name Publisher;
	public String SobjectType;
	public String StartField;
	public Datetime SystemModstamp;

	public CalendarViewShare[] Shares;

	public CalendarView clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalendarView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalendarView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalendarView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalendarView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
