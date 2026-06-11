/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoyaltyProgramJournalTypeChangeEvent extends SObject {
	public static SObjectType$<LoyaltyProgramJournalTypeChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyProgramJournalTypeChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id JournalSubTypeId;
	public JournalSubType JournalSubType;
	public Id JournalTypeId;
	public JournalType JournalType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public String Name;
	public String ReplayId;

	public LoyaltyProgramJournalTypeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramJournalTypeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramJournalTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramJournalTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramJournalTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
