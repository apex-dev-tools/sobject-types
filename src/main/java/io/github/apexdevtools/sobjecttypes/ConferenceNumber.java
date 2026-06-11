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
public class ConferenceNumber extends SObject {
	public static SObjectType$<ConferenceNumber> SObjectType;
	public static SObjectFields$<ConferenceNumber> Fields;

	public String AccessCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id ExternalEventId;
	public ExternalEvent ExternalEvent;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Number;
	public Datetime SystemModstamp;
	public String Vendor;

	public ConferenceNumber clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConferenceNumber clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConferenceNumber clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConferenceNumber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConferenceNumber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
