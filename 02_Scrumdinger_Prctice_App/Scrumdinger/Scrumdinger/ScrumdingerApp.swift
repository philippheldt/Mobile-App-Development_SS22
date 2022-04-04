//
//  ScrumdingerApp.swift
//  Scrumdinger
//
//  Created by Philipp Jenny on 30.03.22.
//

import SwiftUI

@main
struct ScrumdingerApp: App {
    var body: some Scene {
        WindowGroup {
            NavigationView{
                ScrumsView(scrums: DailyScrum.sampleData)
            }
        }
    }
}
